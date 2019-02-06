     #define LED1_R  14 
#define LED1_G  5 
#define LED2_R  12 
#define LED2_G  13 
const byte SW1 = 4;
const byte SW2 = 32; 
const byte SW3 = 16;

volatile int LED1 = 0;
volatile int LED2 = 0;

portMUX_TYPE mux_1 = portMUX_INITIALIZER_UNLOCKED;
#define DI_1() portENTER_CRITICAL_ISR(&mux_1);  //割込み禁止
#define EI_1() portEXIT_CRITICAL_ISR(&mux_1);   //割込み許可

portMUX_TYPE mux_2 = portMUX_INITIALIZER_UNLOCKED;
#define DI_2() portENTER_CRITICAL_ISR(&mux_2);  //割込み禁止
#define EI_2() portEXIT_CRITICAL_ISR(&mux_2);   //割込み許可
portMUX_TYPE mux_3 = portMUX_INITIALIZER_UNLOCKED;
#define DI_2() portENTER_CRITICAL_ISR(&mux_3);  //割込み禁止
#define EI_2() portEXIT_CRITICAL_ISR(&mux_3);   //割込み許可

void IRAM_ATTR handleInterrupt_1() {
  DI_1();
  if(LED1 == 0){
    digitalWrite(LED1_G, HIGH);
    digitalWrite(LED1_R, LOW);
    LED1 = 1;
  }else{
    digitalWrite(LED1_G, LOW);
    digitalWrite(LED1_R, HIGH);
    LED1 = 0;
  }


  EI_1();
}

void IRAM_ATTR handleInterrupt_2() {
  DI_2();
  if(LED2 == 0){
    digitalWrite(LED2_G, HIGH);
    digitalWrite(LED2_R, LOW);
    LED2 = 1;
  }else{
    digitalWrite(LED2_G, LOW);
    digitalWrite(LED2_R, HIGH);
    LED2 = 0;
  }
  EI_2();
}
void IRAM_ATTR handleInterrupt_3() {
  DI_2();
  digitalWrite(LED1_R, LOW);
  digitalWrite(LED1_G, LOW);
  digitalWrite(LED2_R, LOW);
  digitalWrite(LED2_G, LOW);
  EI_2();
}

void setup() {
  Serial.begin(115200);
  pinMode(LED1_R, OUTPUT);
  pinMode(LED1_G, OUTPUT);
  pinMode(LED2_R, OUTPUT);
  pinMode(LED2_G, OUTPUT);
  pinMode(SW1, INPUT_PULLUP);
  pinMode(SW2, INPUT_PULLUP);
  pinMode(SW3, INPUT_PULLUP);
  attachInterrupt (digitalPinToInterrupt(SW1), handleInterrupt_1, FALLING);
  attachInterrupt (digitalPinToInterrupt(SW2), handleInterrupt_2, FALLING);
  attachInterrupt (digitalPinToInterrupt(SW3), handleInterrupt_3, FALLING);

}

void loop() {

}
