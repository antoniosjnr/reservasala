package br.unesc.reserva.dao;

import br.unesc.reserva.modelo.Reserva;
import br.unesc.reserva.modelo.ResponsavelCombo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    private final String INSERT = "insert into reserva (codigo,id_sala,id_responsavel,data,periodo) values(?,?,?,?,?)";
    private final String UPDATE = "update reserva set id_sala = ?, id_responsavel = ?, data = ?, periodo = ? where codigo = ?";
    private final String DELETE = "delete from reserva where codigo = ?";
    private final String GET_RESERVA = "select * from reserva where codigo = ?";
    private final String GET_CODIGORESERVA = "select max(codigo) from reserva";
    private final String LISTA_SALA = "select codigo from sala";
    private final String LISTA_RESPONSAVEL = "select codigo, nome from responsavel";

    public void insert(Reserva reserva) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(INSERT);
            ps.setInt(1, getCodigo());
            ps.setInt(2, reserva.getIdSala());
            ps.setInt(3, reserva.getIdResponsavel());
            ps.setDate(4, reserva.getData());
            ps.setString(5, reserva.getPeriodo());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Reserva reserva) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(UPDATE);
            ps.setInt(1, reserva.getIdSala());
            ps.setInt(2, reserva.getIdResponsavel());
            ps.setDate(3, reserva.getData());
            ps.setString(4, reserva.getPeriodo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void delete(Reserva reserva) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(DELETE);
            ps.setInt(1, reserva.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public Reserva getReserva(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(GET_RESERVA);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Reserva r = new Reserva();
                r.setCodigo(rs.getInt(1));
                r.setIdSala(rs.getInt(2));
                r.setIdResponsavel(rs.getInt(3));
                r.setData(rs.getDate(4));
                r.setPeriodo(rs.getString(5));

                return r;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

    public Integer getCodigo() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(GET_CODIGORESERVA);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                int codigo = rs.getInt(1);
                return codigo++;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

    public List<String> getSalas() {
        Connection conn = null;
        PreparedStatement ps = null;

        List<String> listaSala = new ArrayList<>();

        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(LISTA_SALA);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                listaSala.add(String.valueOf(rs.getInt(1)));
            }
            return listaSala;
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }
    
    public List<ResponsavelCombo> getResponsavel() {
        Connection conn = null;
        PreparedStatement ps = null;

        List<ResponsavelCombo> listaResponsaveis = new ArrayList<>();

        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(LISTA_RESPONSAVEL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ResponsavelCombo r = new ResponsavelCombo();
                r.setCodigo(rs.getInt(1));
                r.setNome(rs.getString(2));                
                listaResponsaveis.add(r);
            }
            return listaResponsaveis;
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

}
