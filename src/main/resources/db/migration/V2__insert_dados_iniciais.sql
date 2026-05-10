INSERT INTO modalidades (nome) VALUES 
('Jiu-Jitsu'), 
('Muay Thai'), 
('Boxe'), 
('CrossFit'), 
('Yoga'),
('Musculação'),
('Funcional'),
('Pilates');

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 150.00
FROM modalidades WHERE nome = 'Jiu-Jitsu';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 140.00
FROM modalidades WHERE nome = 'Muay Thai';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 130.00
FROM modalidades WHERE nome = 'Boxe';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 180.00
FROM modalidades WHERE nome = 'CrossFit';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 120.00
FROM modalidades WHERE nome = 'Yoga';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 200.00
FROM modalidades WHERE nome = 'Musculação';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 100.00
FROM modalidades WHERE nome = 'Funcional';

INSERT INTO planos (modalidade_id, nome, valor_mensal)
SELECT id, 'Mensal', 150.00
FROM modalidades WHERE nome = 'Pilates';

INSERT INTO graduacoes (modalidade_id, nome) VALUES 
((SELECT id FROM modalidades WHERE nome = 'Jiu-Jitsu'), 'Faixa Branca'),
((SELECT id FROM modalidades WHERE nome = 'Jiu-Jitsu'), 'Faixa Azul'),
((SELECT id FROM modalidades WHERE nome = 'Jiu-Jitsu'), 'Faixa Roxa'),
((SELECT id FROM modalidades WHERE nome = 'Jiu-Jitsu'), 'Faixa Marrom'),
((SELECT id FROM modalidades WHERE nome = 'Jiu-Jitsu'), 'Faixa Preta'),
((SELECT id FROM modalidades WHERE nome = 'Muay Thai'), 'Iniciante'),
((SELECT id FROM modalidades WHERE nome = 'Muay Thai'), 'Intermediário'),
((SELECT id FROM modalidades WHERE nome = 'Muay Thai'), 'Avançado'),
((SELECT id FROM modalidades WHERE nome = 'Boxe'), 'Iniciante'),
((SELECT id FROM modalidades WHERE nome = 'Boxe'), 'Intermediário'),
((SELECT id FROM modalidades WHERE nome = 'Boxe'), 'Avançado'),
((SELECT id FROM modalidades WHERE nome = 'CrossFit'), 'Iniciante'),
((SELECT id FROM modalidades WHERE nome = 'CrossFit'), 'Intermediário'),
((SELECT id FROM modalidades WHERE nome = 'CrossFit'), 'Avançado'),
((SELECT id FROM modalidades WHERE nome = 'Yoga'), 'Iniciante'),
((SELECT id FROM modalidades WHERE nome = 'Yoga'), 'Intermediário'),
((SELECT id FROM modalidades WHERE nome = 'Yoga'), 'Avançado'),
((SELECT id FROM modalidades WHERE nome = 'Musculação'), 'Iniciante'),
((SELECT id FROM modalidades WHERE nome = 'Musculação'), 'Intermediário'),
((SELECT id FROM modalidades WHERE nome = 'Musculação'), 'Avançado'),
((SELECT id FROM modalidades WHERE nome = 'Funcional'), 'Iniciante'),
((SELECT id FROM modalidades WHERE nome = 'Funcional'), 'Intermediário'),
((SELECT id FROM modalidades WHERE nome = 'Funcional'), 'Avançado'),
((SELECT id FROM modalidades WHERE nome = 'Pilates'), 'Iniciante'),
((SELECT id FROM modalidades WHERE nome = 'Pilates'), 'Intermediário'),
((SELECT id FROM modalidades WHERE nome = 'Pilates'), 'Avançado');