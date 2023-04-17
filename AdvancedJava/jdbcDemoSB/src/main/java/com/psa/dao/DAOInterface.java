package com.psa.dao;

import java.util.List;

public interface DAOInterface {
   void insertRecords();
   @SuppressWarnings("rawtypes")
   List selectData();
}
