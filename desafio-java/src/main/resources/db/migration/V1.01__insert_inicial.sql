INSERT INTO public.pessoa(
	id, nome, datanascimento, cpf, funcionario)
	VALUES (default,'Gerente 1', CURRENT_DATE, '64928804040', true);
	
INSERT INTO public.pessoa(
	id, nome, datanascimento, cpf, funcionario)
	VALUES (default,'Gerente 2', CURRENT_DATE, '70953076016', true);
	
INSERT INTO public.pessoa(
	id, nome, datanascimento, cpf, funcionario)
	VALUES (default,'Gerente 3', CURRENT_DATE, '81053406070', true);
	
INSERT INTO public.pessoa(
	id, nome, datanascimento, cpf, funcionario)
	VALUES (default,'Pessoa 1', CURRENT_DATE, '40161833080', false);

INSERT INTO public.projeto(
	id, nome, data_inicio, data_previsao_fim, data_fim, descricao, status, orcamento, risco, idgerente)
	VALUES (default, 'Projeto 1', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'descricao projeto 1', 'INICIADO', '100', 'MEDIO_RISCO', 1);
	
INSERT INTO public.projeto(
	id, nome, data_inicio, data_previsao_fim, data_fim, descricao, status, orcamento, risco, idgerente)
	VALUES (default, 'Projeto 2', CURRENT_DATE, CURRENT_DATE, CURRENT_DATE, 'descricao projeto 2', 'EM_ANALISE', '200', null, 1);