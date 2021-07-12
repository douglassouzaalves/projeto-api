package br.com.projetoapi.projetolivraria.model;

import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface LivroMapper {
    @Insert("INSERT INTO livros(titulo,isbn,autor,edicao,editora) "
            + "VALUES (#{titulo},#{isbn},#{autor},#{edicao},#{editora})")
    public int insert(Livro livro);

    @Update("UPDATE livros SET titulo=#{titulo},isbn=#{isbn},"
            + "autor=#{autor},edicao=#{edicao},editora=#{editora} WHERE livro_id=#{livroId}")
    public int update(Livro livro);

    @Select("SELECT livro_id AS livroId,titulo,isbn,autor,edicao,editora FROM livros")
    public List<Livro> select();

    @Delete("DELETE FROM livros WHERE livro_id=#{livroId}")
    public int delete(Long livroId);
}
