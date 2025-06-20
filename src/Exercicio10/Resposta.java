package Exercicio10;

/*

Controle de Versão

Você deseja descartar completamente as alterações feitas no arquivo Calculadora.java,
restaurando a última versão salva no repositório, sem afetar outros arquivos do projeto.
Qual comando deve usar?

git reset --hard // remove todas as mudanças em todos arquivos, não sendo útil aqui
git checkout Calculadora.java <---- correta, esse aqui restaura apenas o arquivo solicitado
git commit --amend // funciona apenas para modificar o commit mais recente
git revert HEAD // cria um commit que desfaz o anterior

*/