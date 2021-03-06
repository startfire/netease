package ssm.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import ssm.model.Product;

import java.util.List;

public interface TrxMapper {

    List<Product> getBuyList(@Param("id") Integer userId);

    @Insert("INSERT INTO trx(contentId, personId, num, price, time) " +
            "VALUE (#{product.id}, #{id}, #{product.buyNum}, #{product.buyPrice}, #{buyTime} )")
    boolean buy(@Param("id") Integer id, @Param("product") Product product,
                @Param("buyTime") Long buyTime);
}
