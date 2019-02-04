#define LED_PIN 14
#define PIN_SW 4
#define Delaytime 10
    int Brightness = 0;

    int state =0;
    int in;
    int prev;
void setup()
{
    pinMode(LED_PIN, OUTPUT);
    pinMode(PIN_SW, INPUT);
    ledcSetup(0,490,8);
    ledcAttachPin(14,0);
    Serial.begin(115200);

}
void loop(){
    in = digitalRead(PIN_SW);

    in = get_sw(prev);
    if(prev != in){
        prev = in;
        if(in == HIGH){
            Serial.print(state);
            if(state == 0){
                ledcWrite(0,255);
                state = 1;
            }
            else if(state == 1){
                ledcWrite(0,255/2);
                state = 2;
            }
            else if(state == 2){
                ledcWrite(0,0);
                state = 0;
            }
        }
    }
    delay(100);
    


}

int get_sw(int sw_out) {
  int in1, in2;

  in1 = digitalRead(PIN_SW); // GPIO14から入力 GPIO14はPullUpしてある
  delay(100);               // 要調整
  in2 = digitalRead(PIN_SW);

  if (in1 == in2 ) {
    sw_out = in2;
  }
  return (sw_out);
}
