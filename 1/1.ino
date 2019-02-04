#define LED_R 14
#define LED_G 5
void setup(){
    pinMode(LED_R, OUTPUT);
    pinMode(LED_G, OUTPUT);

}
void loop(){
    LED(LED_R,LED_G);
}
void LED(int R_LED,int G_LED){
    digitalWrite(R_LED,HIGH);
    digitalWrite(G_LED,LOW);
    delay(1000);
    digitalWrite(R_LED,LOW);
    digitalWrite(G_LED,HIGH);
    delay(1000);
    digitalWrite(R_LED, HIGH);
    digitalWrite(G_LED, HIGH);
    delay(1000);
    digitalWrite(R_LED, LOW);
    digitalWrite(G_LED, LOW);
    delay(1000);
    digitalWrite(R_LED, HIGH);
    digitalWrite(G_LED, HIGH);
    delay(1000);
    digitalWrite(R_LED, LOW);
    digitalWrite(G_LED, LOW);
    delay(1000);          
}