SELECT * FROM public.cursos
ORDER BY id ASC

BEGIN;

-- Inserindo registros em professores
INSERT INTO public.professores (nome, sobrenome, endereco, telefone, email, data_nascimento, nacionalidade)
VALUES
    ('jao', 'Silva', 'Rua das Flores, 123, São Paulo', '+5511998765432', 'joao.silva@email.com', '1975-03-15', 'Brasileiro'),
    ('Maria', 'Oliveira', 'Av. Central, 456, Rio de Janeiro', '+5521987654321', 'maria.oliveira@email.com', '1980-07-22', 'Brasileira'),
    ('Carlos', 'Santos', 'Rua do Sol, 789, Belo Horizonte', '+5531976543210', 'carlos.santos@email.com', '1968-11-30', 'Brasileiro'),
    ('Ana', 'Pereira', 'Travessa Azul, 101, Porto Alegre', '+5551987654321', 'ana.pereira@email.com', '1972-05-10', 'Brasileira'),
    ('Pedro', 'Costa', 'Rua das Palmeiras, 202, Salvador', '+5571987654321', 'pedro.costa@email.com', '1985-09-18', 'Brasileiro');

-- Inserindo registros em estudantes
INSERT INTO public.estudantes (nome, sobrenome, matricula, email, data_nascimento, nacionalidade, media_geral)
VALUES
    ('Lucas', 'Almeida', '2023001', 'lucas.almeida@email.com', '2003-01-12', 'Brasileiro', '8.5'),
    ('Julia', 'Fernandes', '2023002', 'julia.fernandes@email.com', '2004-04-25', 'Brasileira', '7.8'),
    ('Rafael', 'Mendes', '2023003', 'rafael.mendes@email.com', '2002-09-03', 'Brasileiro', '9.2'),
    ('Sofia', 'Ribeiro', '2023004', 'sofia.ribeiro@email.com', '2003-11-17', 'Brasileira', '8.0'),
    ('Gabriel', 'Lima', '2023005', 'gabriel.lima@email.com', '2004-06-30', 'Brasileiro', '7.5'),
    ('Beatriz', 'Gomes', '2023006', 'beatriz.gomes@email.com', '2003-03-08', 'Brasileira', '8.9');

-- Inserindo registros em cursos
INSERT INTO public.cursos (codigo, nome, modalidade, professor_id, numero_maximo_alunos)
VALUES
    ('MAT101', 'Matemática Básica', 'Presencial', 1, 40),
    ('FIS201', 'Física Aplicada', 'EAD', 2, 50),
    ('PROG301', 'Programação I', 'Presencial', 3, 30),
    ('HIST401', 'História Moderna', 'Híbrido', 4, 35);

-- Inserindo registros em estudantes_cursos
INSERT INTO public.estudantes_cursos (estudante_id, curso_id, media_curso)
VALUES
    (1, 1, 8.7),
    (1, 3, 9.0),
    (2, 1, 7.5),
    (3, 2, 9.5),
    (4, 3, 8.2),
    (5, 4, 7.8),
    (6, 1, 9.1),
    (6, 2, 8.8);

END;
