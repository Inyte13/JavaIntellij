package com.inyte.banco.menus;

import com.inyte.banco.models.*;
import com.inyte.banco.services.*;

public interface SubmenuCuenta {
  void submenu(Banco banco, Menu menu, Persona persona, Cuenta cuenta);
}
