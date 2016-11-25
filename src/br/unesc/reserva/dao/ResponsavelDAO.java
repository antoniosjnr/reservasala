/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesc.reserva.dao;

import br.unesc.reserva.modelo.Reserva;
import br.unesc.reserva.modelo.Responsavel;
import br.unesc.reserva.modelo.ResponsavelCombo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeff
 */
public class ResponsavelDAO { 
    private final String INSERT = "insert into reserva (codigo,id_sala,id_responsavel,data,periodo) values(?,?,?,?,?)";
    private final String UPDATE = "update reserva set id_sala = ?, id_responsavel = ?, data = ?, periodo = ? where codigo = ?";
    private final String DELETE = "delete from reserva where codigo = ?";
    private final String GET_RESERVA = "select * from reserva where codigo = ?";
    private final String GET_CODIGORESERVA = "select coalesce(max(codigo),0) from reserva";
    private final String LISTA_SALA = "select codigo from sala";
    private final String LISTA_RESPONSAVEL = "select codigo, nome from responsavel";
    
        public void insert(Responsavel responsavel) {
                 Connection conn = null;
                  PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(INSERT);
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
            ps = conn.prepareStatement(GET_RESERVA);
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

    public List<String> getReservas() {
        Connection conn = null;
        PreparedStatement ps = null;

        List<String> reservas = new ArrayList<>();

        try {
            conn = Conexao.getConnection();
            ps = conn.prepareStatement(LISTA_SALA);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reservas.add(String.valueOf(rs.getInt(1)));
            }
            return reservas;
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