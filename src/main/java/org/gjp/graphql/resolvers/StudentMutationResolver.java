package org.gjp.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.gjp.graphql.modal.Student;
import org.gjp.graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentMutationResolver implements GraphQLMutationResolver
{
    @Autowired
    private StudentService studentService;

    public Student createStudent (Student student) {
        return studentService.createStudentRecord(student);
    }
}
