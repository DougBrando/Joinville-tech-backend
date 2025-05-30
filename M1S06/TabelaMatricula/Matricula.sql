BEGIN;

CREATE TABLE IF NOT EXISTS public.professores
        (
                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
nome character varying(128) NOT NULL,
sobrenome character varying(128) NOT NULL,
endereco text,
telefone character varying(15) NOT NULL,
email character varying(100) NOT NULL,
data_nascimento date,
nacionalidade character varying(50),
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.estudantes
        (
                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
nome character varying(50),
sobrenome character varying(50),
matricula character varying(20),
email character varying(100),
data_nascimento date,
nacionalidade character varying(50),
media_geral character varying,
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.cursos
        (
                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
codigo character varying(10) NOT NULL,
nome character varying(100) NOT NULL,
modalidade character varying(10),
professor_id bigint,
numero_maximo_alunos bigint NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.estudantes_cursos
        (
                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
estudante_id bigint NOT NULL,
curso_id bigint NOT NULL,
media_curso numeric(4,2),
PRIMARY KEY (id),
CONSTRAINT unique_estudante_curso UNIQUE (estudante_id, curso_id)
);

ALTER TABLE IF EXISTS public.cursos
ADD CONSTRAINT fk_professor_id FOREIGN KEY (professor_id)
REFERENCES public.professores (id) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION
NOT VALID;

ALTER TABLE IF EXISTS public.estudantes_cursos
ADD CONSTRAINT fk_estudante_id FOREIGN KEY (estudante_id)
REFERENCES public.estudantes (id) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION
NOT VALID;

ALTER TABLE IF EXISTS public.estudantes_cursos
ADD CONSTRAINT fk_curso_id FOREIGN KEY (curso_id)
REFERENCES public.cursos (id) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION
NOT VALID;

END;
