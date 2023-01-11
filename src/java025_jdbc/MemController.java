package java025_jdbc;

import java.util.List;

public class MemController {

	private MemService service;
	
	public MemController() {
		service = new MemService();
	}
	
	public List<MemDTO> listProcess() {
		return service.getMemList();
	}
	
	public int insertProcess(String name, int age, String loc) {
		MemDTO dto = new MemDTO(name, age, loc);
		return service.getInsert(dto);
	}
}
