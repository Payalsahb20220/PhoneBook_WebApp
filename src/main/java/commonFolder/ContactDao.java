package commonFolder;


import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.Delete;



@Dao
public interface ContactDao {
    @Insert
    int insert(Contact contact);

    @Update
    int update(Contact contact);

    @Delete
    int delete(Contact contact);
}
