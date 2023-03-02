package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {

	public RedesController() {
		super();
	}
	
	private String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void ip() {
		
		String osNome = os();
		String IpWindows = "ipconfig";
		String IpLinux = "ifconfig";
		
		if(osNome.contains("Windows")) {
			try {
				Process p = Runtime.getRuntime().exec(IpWindows);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String adaptador = "";
				while(linha != null) {
					if(linha.contains("Adaptador")) {
						adaptador = linha;
					}
//					linha = buffer.readLine();
					if(linha.contains("IPv4")) {
						String ipv4 = linha;
						System.out.println(adaptador + ipv4);
					}
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(osNome.contains("Linux")) {
			try {
				Process p = Runtime.getRuntime().exec(IpLinux);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String adaptador = "";
				while(linha != null) {
					if(linha.contains("Adaptador")) {
						adaptador = linha;
					}
//					linha = buffer.readLine();
					if(linha.contains("IPv4")) {
						String ipv4 = linha;
						System.out.println(adaptador + ipv4);
					}
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		}
	public void ping() {
		String osNome = os();
		String PingWindows = "PING -4 -n 10 www.google.com.br";
		String PingLinux = "PING -4 -c 10 www.google.com.br";
		
		if(osNome.contains("Windows")) {
			try {
				Process p = Runtime.getRuntime().exec(PingWindows);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String media = "";
				while(linha != null) {
					if(linha.contains("dia")) {
						media = linha;
						String[] retornoSplit = linha.split(",");
						for(int i=0; i<retornoSplit.length;i++) {
							if(retornoSplit[i].contains("dia")) {
								System.out.println(retornoSplit[i]);
							}
						}
					}
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(osNome.contains("Linux")) {
			try {
				Process p = Runtime.getRuntime().exec(PingWindows);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String media = "";
				while(linha != null) {
					if(linha.contains("dia")) {
						media = linha;
						String[] retornoSplit = linha.split(",");
						for(int i=0; i<retornoSplit.length;i++) {
							if(retornoSplit[i].contains("dia")) {
								System.out.println(retornoSplit[i]);
							}
						}
					}
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
