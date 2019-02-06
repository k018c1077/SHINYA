int LED_R = 14;
int LED_G = 5;

int DelayTime = 1000;

void setup()
{
  pinMode(LED_R, OUTPUT);
  pinMode(LED_G, OUTPUT);
}

void loop()
{
  LED(HIGH, LOW);
  delay(1000);
  LED(LOW, HIGH);
  delay(1000);
  LED(HIGH, HIGH);
  delay(1000);
  LED(LOW, LOW);
  delay(1000);
  LED(HIGH, HIGH);
  delay(1000);
  LED(LOW, LOW);
  delay(1000);
}

void LED(int R_LED, int G_LED)
{
  digitalWrite(LED_R, R_LED);
  digitalWrite(LED_G, G_LED);
}
