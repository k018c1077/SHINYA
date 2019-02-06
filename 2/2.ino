#define LED_PIN   14
#define PIN_SW     4
#define DelayTime 10

#define LEDC_CHANNEL_0     0
#define LEDC_TIMER_13_BIT  13
#define LEDC_BASE_FREQ     5000

int in;                      
int prev = 0;
int brightness = 0;
int fadeAmount = 5;

void ledcAnalogWrite(uint8_t channel, uint32_t value, uint32_t valueMax = 255) {
  
  uint32_t duty = (8191 / valueMax) * min(value, valueMax);

  ledcWrite(channel, duty);
}

void setup() {
  ledcSetup(LEDC_CHANNEL_0, LEDC_BASE_FREQ, LEDC_TIMER_13_BIT);
  ledcAttachPin(LED_PIN, LEDC_CHANNEL_0);
  
  pinMode(PIN_SW, INPUT_PULLUP);   
  ledcAnalogWrite(LEDC_CHANNEL_0, 0);
  Serial.begin(115200);
}

void loop() {
  in = get_sw(prev);        
  ledcAnalogWrite(LEDC_CHANNEL_0, brightness);

  if (in == 0) {    
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

  in1 = digitalRead(PIN_SW); 
  delay(DelayTime);               
  in2 = digitalRead(PIN_SW);

  if (in1 == in2 ) {
    sw_out = in2;
  }
  return (sw_out);
}
