**A**
**Array de tipos primitivos (int[], double[]):**
A memória é alocada de forma contínua.
Cada posição do array armazena diretamente o valor.
O array numeros já contém os valores 0 (valor padrão de int).
**Array de objetos (Aluno[], Produto[]):**
A memória do array armazena referências (ponteiros) para objetos, não os objetos em si.
Inicialmente, cada posição é null, até que um objeto seja criado e atribuído.
Só depois de instanciar o objeto com new, a referência deixa de ser null.
**B**
Verifique se o elemento não é null antes de usar
Ao acessar um método ou atributo de um objeto em um array, você precisa garantir que aquele índice não está nulo, senão ocorre NullPointerException.
Não esquecer de instanciar os objetos
