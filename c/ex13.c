#include <studio.h>

int main(void) {
  int inicio;
  printf("Iniciar ccontagem regressiva em: ");
  scanf("%d", &inicio);

  if (iniccio < 0) {
    printf("Informe um número positivo.\n");
    return 0;
  }
for (int numero = inicio; numero >= 0; numero--) {
  printf("%d\n", numero);
}
printf("Fim da contagem!\n");
return 0;
}
