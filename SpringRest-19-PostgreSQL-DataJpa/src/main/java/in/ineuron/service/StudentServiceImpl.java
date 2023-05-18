package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IStudentDao;
import in.ineuron.exception.StudentNotFoundException;
import in.ineuron.model.Student;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao dao;

	@Override
	public String saveStudent(Student student) {
		Student stud = dao.save(student);
		return "Student save with the id : "+stud.getId();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = dao.findAll();
		return findAll;
	}

	@Override
	public Student getStudentByID(Integer id) {
		Student student = dao.findById(id).orElseThrow(()-> new StudentNotFoundException("Student Record not found with id : "+id));
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		Student stud = dao.save(student);
			
		return "Student Record Updated With the id : "+stud.getId();
	}

	@Override
	public String deleteStudentById(Integer id) {
		Student student = dao.findById(id).orElseThrow(()-> new StudentNotFoundException("Student Record not Found with the id : "+id));
		dao.delete(student);
		return "Deleted Successfully";
	}

}
