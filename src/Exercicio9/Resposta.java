package Exercicio9;

/*

Git no fluxo de trabalho

Durante o desenvolvimento de um projeto Java, um
estagiário cometeu um erro no commit mais recente e
deseja desfazê-lo, mas manter as alterações feitas
nos arquivos para corrigir e comitar novamente. Qual
comando deve ser usado?


git reset --hard HEAD1 // esse desfaz todas mudanças
git revert HEAD // esse faz um commit novo que
desfaz o anterior
git reset --soft HEAD1 <---- correta, funciona para
o contexto apresentando
git reset --mixed HEAD~1 // esse desfaz o commit e
remove os arquivos da área staging

*/