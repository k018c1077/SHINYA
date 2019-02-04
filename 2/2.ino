#define LED_PIN 14
#define PIN_SW 4
#define Delaytime 10
    int Brightness = 0;
    int last =0;
    int now =0;
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
        while(Brightness<256){
            ledcWrite(0,Brightness);
            Brightness += 10;
            delay(Delaytime);
            
        }
        Brightness = 255;
        ledcWrite(0,Brightness);
        }else{
        while(Brightness>0){
            ledcWrite(0,Brightness);
            Brightness -= 10;
            delay(Delaytime);
        }
        Brightness = 0;
        ledcWrite(0,Brightness);
        }
    }
    delay(100);


}
