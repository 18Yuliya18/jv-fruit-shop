package service;

import java.util.List;
import java.util.Map;
import model.Fruit;
import service.impl.TransactionDto;

public interface FileService {
    Map<Fruit, Integer> saveDataToDb(List<TransactionDto> data);
}
