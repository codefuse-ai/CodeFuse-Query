# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AugmentedAssignmentStatement(Base):
    __tablename__ = "augmented_assignment_statement"

    element_oid = Column(Integer, primary_key=True)
    op_code = Column(Text, nullable=False)
    target_expr_oid = Column(Integer, nullable=False)
    value_expr_oid = Column(Integer, nullable=False)
