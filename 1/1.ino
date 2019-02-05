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
  LED(LED_R, LED_G);
}

void LED(int R_LED, int G_LED)
{
  digitalWrite(R_LED, HIGH);
  digitalWrite(G_LED, LOW);
  delay(DelayTime);

  digitalWrite(R_LED, LOW);
  digitalWrite(G_LED, HIGH);
  delay(DelayTime);

  digitalWrite(R_LED, HIGH);
  digitalWrite(G_LED, HIGH);
  delay(DelayTime);

  digitalWrite(R_LED, LOW);
  digitalWrite(G_LED, LOW);
  delay(DelayTime);

  digitalWrite(R_LED, HIGH);
  digitalWrite(G_LED, HIGH);
  delay(DelayTime);

  digitalWrite(R_LED, LOW);
  digitalWrite(G_LED, LOW);
  delay(DelayTime);
}
