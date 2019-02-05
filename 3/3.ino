#define LED 14           
#define PIN_SW 16
#define DelayTime 3

#define LED_OFF 0
#define LED_MID 30
#define LED_MAX 255

int in;                      // 現在のswの状態
int prev = 0;
int counter = 0;

void setup() {
  pinMode(PIN_SW, INPUT_PULLUP);    // SWピンを入力にする
  pinMode(LED, OUTPUT);      // ledピンを出力にする
  ledcSetup(0,490,8);
  ledcAttachPin(14,0);
  Serial.begin(115200); // for debug
}

void loop() {
  in = get_sw(prev);        // swの状態を読みinに代入

  if (in != prev) {     // 前の値と同じならパス
    prev = in;    // 前の状態を更新
    if (in == 0 && counter == 0) {      // スイッチが押された
      Serial.println(counter);
      ledcWrite(0, LED_MAX);
      counter++;
    }else if (in == 0 && counter == 1) {      // スイッチが押された
      Serial.println(counter);
      ledcWrite(0, LED_MID);
      counter++;
    }else if (in == 0 && counter == 2) {      // スイッチが押された
      Serial.println(counter);
      ledcWrite(0, LED_OFF);
      counter = 0;
    }
    delay(100);  // チャッタリング軽減
  }
}

int get_sw(int sw_out) {
  int in1, in2;

  in1 = digitalRead(PIN_SW); // GPIO14から入力 GPIO14はPullUpしてある
  delay(DelayTime);               // 要調整
  in2 = digitalRead(PIN_SW);

  if (in1 == in2 ) {
    sw_out = in2;
  }
  return (sw_out);
}
