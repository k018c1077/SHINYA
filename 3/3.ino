#define LED_PIN 14
#define PIN_SW 4
#define Delaytime 10
    int Brightness = 0;
    int last =0;
    int now =0;
    int state =0;
void setup()
{
    pinMode(LED_PIN, OUTPUT);
    pinMode(PIN_SW, INPUT);
    ledcSetup(0,490,8);
    ledcAttachPin(14,0);
    Serial.begin(115200);

}
void loop(){
    now = digitalRead(PIN_SW);


    if(last != now){
        last = now;
        if(now == HIGH){
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
