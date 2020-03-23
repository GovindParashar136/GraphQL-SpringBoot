package org.gjp.graphql.resolvers;

import org.gjp.graphql.modal.Student;
import org.gjp.graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver
{
    @Autowired
    private StudentService studentService;

    public Student student (String name)
    {
        return studentService.getStudentDetailsByName(name);
    }
}
