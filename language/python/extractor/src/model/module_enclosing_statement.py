# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ModuleEnclosingStatement(Base):
    __tablename__ = "module_enclosing_statement"

    statement_oid = Column(Integer, primary_key=True)
    module_oid = Column(Integer, nullable=False)
