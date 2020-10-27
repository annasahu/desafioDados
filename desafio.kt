/*1.Encontre a idade média dos usuários (use apenas idades válidas para o cálculo!)
2.Extraia os nomes dos arquivos de entrada que contêm dados defeituosos
3.Conte o número total de entradas com defeito em todos os arquivos de entrada*/

fun main(){
    val rawData = mapOf (
        "users1.csv" to listOf (32, 45, 17, -1, 34),
        "users2.csv" to listOf (19, -1, 67, 22),
        "users3.csv" to listOf (15, -124, 0, 12),
        "users4.csv" to listOf (56, 32, 18, 44)
	)
	// calculo da idade media
    val idadeMedia =  rawData.flatMap { it.value }
        .filter { it > 0}
        .average()
        print("Idade média: $idadeMedia\n")
        
    // quais csv estao incorretos
    val arquivosDadosIncorretos = rawData.flatMap { it.value }
        .filter { it <= 0 }
        .count()
        print("Arquivos com dados incorretos: $arquivosDadosIncorretos\n")
	
    // dados que estao incorretos
    val dadosIncorretos = rawData.filter { it.value.any{ it <= 0} }
        .map { it.key }
        print("Quantidade de dados incorretos: $dadosIncorretos\n")
    
}
