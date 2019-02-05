#define LED_PIN   14
#define PIN_SW     4
#define DelayTime 10

#define LEDC_CHANNEL_0     0
#define LEDC_TIMER_13_BIT  13
#define LEDC_BASE_FREQ     5000

int in;                      // 迴ｾ蝨ｨ縺ｮsw縺ｮ迥ｶ諷�
int prev = 0;
int brightness = 0;
int fadeAmount = 5;

void ledcAnalogWrite(uint8_t channel, uint32_t value, uint32_t valueMax = 255) {
  // duty縺ｮ蛟､縺ｯ縲� 13繝薙ャ繝医�ｮ蛻�隗｣閭ｽ縺ｪ縺ｮ縺ｧ 2 ^ 13 - 1 縺ｨ縺ｪ繧翫8191 縺ｫ縺ｪ繧�  
  uint32_t duty = (8191 / valueMax) * min(value, valueMax);
  // write duty to LEDC
  ledcWrite(channel, duty);
}

void setup() {
  ledcSetup(LEDC_CHANNEL_0, LEDC_BASE_FREQ, LEDC_TIMER_13_BIT);
  ledcAttachPin(LED_PIN, LEDC_CHANNEL_0);
  
  pinMode(PIN_SW, INPUT_PULLUP);    // SW繝斐Φ繧貞�･蜉帙↓縺吶ｋ
  ledcAnalogWrite(LEDC_CHANNEL_0, 0);
  Serial.begin(115200);
}

void loop() {
  in = get_sw(prev);        // sw縺ｮ迥ｶ諷九ｒ隱ｭ縺ｿin縺ｫ莉｣蜈･
  ledcAnalogWrite(LEDC_CHANNEL_0, brightness);

  if (in == 0) {    // 謚ｼ縺輔ｌ縺ｦ縺�繧九→縺�
    brightness = brightness + fadeAmount;
    delay(3);
    Serial.println(in);
  }else if(in == 1 && brightness > 0) {
    brightness = brightness - fadeAmount;
    delay(3);
    Serial.println(in);
  }
}

int get_sw(int sw_out) {
  int in1, in2;

  in1 = digitalRead(PIN_SW); // GPIO14縺九ｉ蜈･蜉� GPIO14縺ｯPullUp縺励※縺ゅｋ
  delay(DelayTime);               // 隕∬ｪｿ謨ｴ
  in2 = digitalRead(PIN_SW);

  if (in1 == in2 ) {
    sw_out = in2;
  }
  return (sw_out);
}
