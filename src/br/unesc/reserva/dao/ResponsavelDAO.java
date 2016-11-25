/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesc.reserva.dao;

import br.unesc.reserva.modelo.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jeff
 */
public class ResponsavelDAO { 
    private final String INSERT = "insert into responsavel values(?,?,?,?,?)";
    private final String UPDATE = "update responsavel set  cpf = '?', nome = '?', telefone = '?', email= '?'";
    private final String DELETE = "delete from responsavel where codigo = ?";
    private final String GET_RESPONSAVEL = "select * from responsavel where codigo = ?";
    private final String GET_CODIGORESPONSAVEL = "select codigo from responsavel order by codigo desc limit 1";
    
        public void insert(Responsavel responsavel) {
                 Connection conn = null;
                  PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(INSERT);
            ps.setInt(1, getCodigo() == null ? 1 : getCodigo());
            ps.setString(2, responsavel.getCPF());
            ps.setString(3, responsavel.getEmail());
            ps.setString(4, responsavel.getNome());
            ps.setString(5, responsavel.getTelefone());
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

    public void update(Responsavel responsavel) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(UPDATE);
            ps.setInt(1, responsavel.getCodigo());
            ps.setString(2, responsavel.getCPF());
            ps.setString(3, responsavel.getEmail());
            ps.setString(4, responsavel.getNome());
            ps.setString(5, responsavel.getTelefone());
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

    public void delete(Responsavel responsavel) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(DELETE);
            ps.setInt(1, responsavel.getCodigo());
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

    public Responsavel getResponsavel(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(GET_RESPONSAVEL);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Responsavel r = new Responsavel();
                
           r.setCodigo(r.getCodigo());
           r.setCPF(r.getCPF());
           r.setEmail(r.getEmail());
           r.setNome(r.getNome());
           r.setTelefone(r.getTelefone());
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
            ps = conn.prepareStatement(GET_CODIGORESPONSAVEL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                int codigo = rs.getInt(1);
                return codigo + 1;
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
 }