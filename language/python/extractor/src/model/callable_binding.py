# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class CallableBinding(Base):
    __tablename__ = "callable_binding"

    caller_oid = Column(Integer, primary_key=True)
    callee_oid = Column(Integer, nullable=False)
