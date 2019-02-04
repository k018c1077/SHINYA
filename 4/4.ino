#define LED1_R 14
#define LED1_G 5
#define LED2_R 12
#define LED2_G 13
const byte SW1 = 4;
const byte SW2 = 32;
const byte SW3 = 16;
volatile int state = 0;
void setup()
{
    pinMode(LED1_G, OUTPUT);
    pinMode(LED1_R, OUTPUT);
    pinMode(LED2_G, OUTPUT);
    pinMode(LED2_R, OUTPUT);
    digitalWrite(LED1_R, LOW);
    digitalWrite(LED1_G, LOW);   
    digitalWrite(LED2_R, LOW);
    digitalWrite(LED2_G, LOW);   
    attachInterrupt(digitalPinToInterrupt(SW1), changeto145blink(), RISING);
    attachInterrupt(digitalPinToInterrupt(SW2), changeto145blink(), RISING);
    attachInterrupt(digitalPinToInterrupt(SW3), blackout(), RISING);
}
void loop()
{
    if (state = 0)
    {
        digitalWrite(LED1_R, HIGH);
        digitalWrite(LED1_G, LOW);
        delay(1000);
        digitalWrite(LED1_R, LOW);
        digitalWrite(LED1_G, HIGH);
        delay(1000);
    }
    else if (state = 1)
    {
        digitalWrite(LED2_R, HIGH);
        digitalWrite(LED2_G, LOW);
        delay(1000);
        digitalWrite(LED2_R, LOW);
        digitalWrite(LED2_G, HIGH);
        delay(1000);
    }
    else
    {
    
    }
    
}
void changeto145blink()
{
    digitalWrite(LED2_R, LOW);
    digitalWrite(LED2_G, LOW);
    state = 0;
}
void changeto1213blink()
{
    digitalWrite(LED1_R, LOW);
    digitalWrite(LED1_G, LOW);
    state = 1;
}
void blackout(){
    digitalWrite(LED1_R, LOW);
    digitalWrite(LED1_G, LOW);   
    digitalWrite(LED2_R, LOW);
    digitalWrite(LED2_G, LOW); 
    state = 2;
}